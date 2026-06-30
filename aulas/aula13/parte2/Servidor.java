package aulas.aula13.parte2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

    static final String ARQUIVO = "aulas/aula13/parte2/veiculos.txt";

    public static void main(String[] args) throws Exception {

        // A lista e o arquivo ficam no servidor.
        List<Veiculo> veiculos = carregar();

        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Servidor ligado na porta 12345. Aguardando clientes...");

        while (true) {
            Socket cliente = servidor.accept();

            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());

            // Recebe o objeto veiculo enviado pelo cliente.
            Veiculo veiculo = (Veiculo) entrada.readObject();

            // Verifica se a placa ja existe na lista.
            boolean jaExiste = false;
            for (Veiculo v : veiculos) {
                if (v.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
                    jaExiste = true;
                }
            }

            String resposta;
            if (jaExiste) {
                resposta = "ERRO: placa ja cadastrada";
            } else {
                veiculos.add(veiculo);
                salvar(veiculos);
                resposta = "SUCESSO: veiculo cadastrado";
            }

            // Responde ao cliente.
            saida.writeObject(resposta);
            saida.flush();
            System.out.println(resposta);

            cliente.close();
        }
    }

    static List<Veiculo> carregar() throws IOException {
        List<Veiculo> veiculos = new ArrayList<>();
        File arquivo = new File(ARQUIVO);
        if (!arquivo.exists()) {
            return veiculos;
        }

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] d = linha.split(";");
            veiculos.add(new Veiculo(d[0], d[1], d[2], Integer.parseInt(d[3]), Double.parseDouble(d[4])));
        }
        leitor.close();
        return veiculos;
    }

    static void salvar(List<Veiculo> veiculos) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO));
        for (Veiculo v : veiculos) {
            escritor.write(v.getPlaca() + ";" + v.getModelo() + ";" + v.getMarca() + ";"
                    + v.getAnoFabricacao() + ";" + v.getQuilometragem());
            escritor.newLine();
        }
        escritor.close();
    }

}
