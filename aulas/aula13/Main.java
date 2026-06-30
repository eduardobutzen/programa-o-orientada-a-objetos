package aulas.aula13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String ARQUIVO = "aulas/aula13/veiculos.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Veiculo> veiculos = carregar();

        while (true) {
            System.out.println("\n===== CADASTRO DE VEICULOS =====");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Alterar quilometragem do veiculo");
            System.out.println("3 - Excluir veiculo pelo numero da placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opcao: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrar(veiculos);
                    break;
                case "2":
                    alterarQuilometragem(veiculos);
                    break;
                case "3":
                    excluir(veiculos);
                    break;
                case "4":
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }

    private static void cadastrar(List<Veiculo> veiculos) {
        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        if (buscarPorPlaca(veiculos, placa) != null) {
            System.out.println("Ja existe um veiculo cadastrado com essa placa!");
            return;
        }

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ano de fabricacao: ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.print("Quilometragem: ");
        double km = Double.parseDouble(scanner.nextLine());

        Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);
        veiculos.add(veiculo);
        salvar(veiculos);

        System.out.println("Veiculo cadastrado com sucesso!");
    }

    private static void alterarQuilometragem(List<Veiculo> veiculos) {
        System.out.print("Informe a placa do veiculo: ");
        String placa = scanner.nextLine();

        Veiculo veiculo = buscarPorPlaca(veiculos, placa);

        if (veiculo == null) {
            System.out.println("Veiculo nao encontrado!");
            return;
        }

        System.out.print("Nova quilometragem: ");
        double km = Double.parseDouble(scanner.nextLine());
        veiculo.setQuilometragem(km);
        salvar(veiculos);

        System.out.println("Quilometragem alterada com sucesso!");
    }

    private static void excluir(List<Veiculo> veiculos) {
        System.out.print("Informe a placa do veiculo: ");
        String placa = scanner.nextLine();

        Veiculo veiculo = buscarPorPlaca(veiculos, placa);

        if (veiculo == null) {
            System.out.println("Veiculo nao encontrado!");
            return;
        }

        veiculos.remove(veiculo);
        salvar(veiculos);

        System.out.println("Veiculo excluido com sucesso!");
    }

    private static Veiculo buscarPorPlaca(List<Veiculo> veiculos, String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    private static List<Veiculo> carregar() {
        List<Veiculo> veiculos = new ArrayList<>();
        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return veiculos;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha = leitor.readLine();
            while (linha != null) {
                String[] dados = linha.split(";");
                if (dados.length == 5) {
                    String placa = dados[0];
                    String modelo = dados[1];
                    String marca = dados[2];
                    int ano = Integer.parseInt(dados[3]);
                    double km = Double.parseDouble(dados[4]);
                    veiculos.add(new Veiculo(placa, modelo, marca, ano, km));
                }
                linha = leitor.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
        }

        return veiculos;
    }

    private static void salvar(List<Veiculo> veiculos) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Veiculo veiculo : veiculos) {
                escritor.write(veiculo.getPlaca() + ";"
                        + veiculo.getModelo() + ";"
                        + veiculo.getMarca() + ";"
                        + veiculo.getAnoFabricacao() + ";"
                        + veiculo.getQuilometragem());
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

}