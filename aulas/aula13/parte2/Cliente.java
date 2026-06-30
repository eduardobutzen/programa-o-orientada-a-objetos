package aulas.aula13.parte2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // O cliente le os dados do veiculo.
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano de fabricacao: ");
        int ano = Integer.parseInt(scanner.nextLine());
        System.out.print("Quilometragem: ");
        double km = Double.parseDouble(scanner.nextLine());

        // Cria o objeto veiculo.
        Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);

        // Conecta no servidor e envia o objeto.
        Socket socket = new Socket("localhost", 12345);
        ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());

        saida.writeObject(veiculo);
        saida.flush();

        // Recebe a resposta do servidor.
        String resposta = (String) entrada.readObject();
        System.out.println("Resposta do servidor: " + resposta);

        socket.close();
    }

}
