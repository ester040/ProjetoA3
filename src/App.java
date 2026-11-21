import java.util.Scanner;

import model.Motorista;
import model.TipoCaminhao;
import model.Multa;
import repository.MotoristaRepository;
import repository.VeiculoRepository;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String placa, modelo;
        int ano, cilindradas, renavam, portas, opcao;
        TipoCaminhao tipoCaminhao;

        VeiculoRepository vr = new VeiculoRepository();

        System.out.println("== Sistema da Transportadora ==");

        while (true) {

            System.out.println(
                    "\n0 - Cadastrar" +
                            "\n1 - Consultar" +
                            "\n2 - Editar" +
                            "\n3 - Apagar" +
                            "\n4 - Sair");

            int escolha = scanner.nextInt();
            int tipoCadastro = 0;

            switch (escolha) {
                case 4:
                    System.exit(0);
                    break;

                case 0, 1, 2, 3:
                    System.out.println(
                            "\n0 - Motorista" +
                                    "\n1 - Carro" +
                                    "\n2 - Moto" +
                                    "\n3 - Caminhão" +
                                    "\n4 - Multa "

                    );
                    tipoCadastro = scanner.nextInt();
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            if (tipoCadastro == 0) {
                MotoristaRepository reposiMotorista = new MotoristaRepository();
                if (0 == escolha) {
                    System.out.println("Nome:");
                    scanner.nextLine();
                    var nome = scanner.nextLine();
                    System.out.println("CNH:");
                    var cnh = scanner.next();
                    System.out.println("CPF:");
                    var cpf = scanner.next();
                    System.out.println("RG:");
                    var rg = scanner.next();
                    System.out.println("Data de nascimento:");
                    var dataDeNascimento = scanner.next();
                    reposiMotorista.cadastrarMotorista(new Motorista(nome, cnh, cpf, rg, dataDeNascimento));

                }

                else if (1 == escolha) {
                    System.out.println("CPF para consultar:");
                    var cpf = scanner.next();
                    System.out.println(reposiMotorista.acharMotorista(cpf));
                }

                else if (2 == escolha) {
                    System.out.println("CPF para consultar:");
                    var cpfAchado = scanner.next();
                    System.out.println("Nome:");
                    scanner.nextLine();
                    var nome = scanner.nextLine();
                    System.out.println("CNH:");
                    var cnh = scanner.next();
                    System.out.println("CPF:");
                    var cpf = scanner.next();
                    System.out.println("RG:");
                    var rg = scanner.next();
                    System.out.println("Data de nascimento:");
                    var dataDeNascimento = scanner.next();
                    reposiMotorista.editarMotorista(new Motorista(nome, cnh, cpf, rg, dataDeNascimento), cpfAchado);
                    System.out.println(reposiMotorista.acharMotorista(cpf));
                }

                else if (3 == escolha) {
                    System.out.println("CPF para apagar:");
                    var cpf = scanner.next();
                    reposiMotorista.apagarMotorista(cpf);
                }

            }

                else if (tipoCadastro == 4 && escolha == 0){

                    MotoristaRepository reposiMotorista = new MotoristaRepository();

                    System.out.println("CPF do motorista:");
                    var cpf = scanner.next();
                    System.out.println("Data da multa:");
                    var data = scanner.next();
                    System.out.println("Hora:");
                    var hora = scanner.next();
                    System.out.println("Endereço:");
                    scanner.nextLine();
                    var endereco = scanner.next();
                    System.out.println("Valor:");
                    var valor = scanner.next();
                    System.out.println("Especificação:");
                    scanner.nextLine();
                    var especificacao = scanner.next();
                    System.out.println("Gravidade:");
                    var gravidade = scanner.next();
                    System.out.println("AIT:");
                    var ait = scanner.next();
                    
                    Multa multa = new Multa(data, hora, endereco, valor, especificacao, gravidade, ait);

                    reposiMotorista.aplicarMulta(cpf, multa);
 
                }

            /*
             * System.out.println("Placa: ");
             * placa = scanner.next();
             * System.out.println("Modelo: ");
             * scanner.nextLine();
             * modelo = scanner.nextLine();
             * System.out.println("Ano: ");
             * ano = scanner.nextInt();
             * System.out.println("Cilindradas: ");
             * cilindradas = scanner.nextInt();
             * System.out.println("Renavam: ");
             * renavam = scanner.nextInt();
             * 
             * Moto moto = new Moto(placa, modelo, ano, cilindradas, renavam);
             * 
             * vr.cadastrarVeiculo(moto);
             * renavam = scanner.nextInt();
             * System.out.println(vr.acharVeiculo(renavam));/*
             */

        }
    }

}
