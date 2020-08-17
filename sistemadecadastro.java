import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class sistemadecadastro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu nome completo");
        String nomeCompleto = in.nextLine();

        String[] array = nomeCompleto.split(" ");
        String letra = String.valueOf(array[0].charAt(0));
        String sobrenome = array[array.length - 1];
        String log = letra + "_" + sobrenome;
        System.out.println(log);

        boolean nomeSenha = false;

        while (nomeSenha == false) {
        System.out.println("Crie a sua senha");
        System.out.println("Deverá possuir no minimo 8 caracteres sendo ao menos uma letra maiúscula,uma letra minúscula,números, um caractere especial.");
        String senha = in.nextLine();

        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @,_])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {

            System.out.println("Senha aceita");

            nomeSenha = true;
            System.out.println("Cadastrado com Sucesso!");

        } else {

            System.out.println("Senha incopativel! Deverá possuir no minimo 8 caracteres sendo ao menos uma letra maiúscula,uma letra minúscula,números e um caractere especial.");


        }
        }



        boolean nomeSenha2 = false;
        while (nomeSenha2 == false) {


                System.out.println("Digite seu login: ");
                String login = in.nextLine();
                System.out.println("Digite sua senha: ");
                String lsenha = in.nextLine();

                if (login.equals(log) && lsenha.equals(nomeSenha)) {
                    nomeSenha2 = true;
                    break;
                }

            if (nomeSenha2 == true) {
                System.out.println("Bem-Vindo!");
            }

            }
        }
    }