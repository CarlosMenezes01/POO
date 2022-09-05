package pooAulas;

public class SalaDeAula {
    public static void main(String[] args) {
        //Declaração dos objetos
        Aluno nelson, hana, mateus;
        hana = new Aluno(); // instanciação objeto hana, foi alocado um espaco na memoria e referenciadop a hana
        System.out.printf("nome:%s\n\n", hana.nome); // acessar o valor do atributo


        hana.nome = "hana yasmim"; //definir valor do atributo
        hana.matricula = "20210000"; //definir valor do atributo
        hana.dataNascimento = "27/12/2000"; //definir valor do atributo


        System.out.printf("nome:%s\n", hana.nome); // acessar o valor do atributo
        System.out.printf("matricula: %s\n", hana.matricula);
        System.out.printf("data nascimento: %s \n\n", hana.dataNascimento);


//        //Nova declaração de objeto
//        Aluno alunoTads; // criei novo objeto
//
//        alunoTads = hana; // MEGA IMPORTANTE - estou atribuindo a instancia do objeto hana ao novo objeto alunoTads. - O mesmo espaço alocado de memoria para hara sera o referenciado ao alunoTads
//        alunoTads.nome = "Hana yasmim B de Medeiros";
//        System.out.println(hana.nome);
//        System.out.println(alunoTads.nome);
//
//        System.out.println();
//
//        System.out.println(hana);
//        System.out.println(alunoTads);
//
//        System.out.println();
//
//
//        //INICIO DA AULA 02/09
//
//        hana = new Aluno();
//        System.out.printf("nome:%s\n", hana.nome); // acessar o valor do atributo
//        System.out.printf("matricula: %s\n", hana.matricula);
//        System.out.printf("data nascimento: %s \n\n", hana.dataNascimento);
//
//
//        //GARBAGE COLECTOR -  estou instanciando aluno tads com a instancia de hana, nesse caso a instancia antiga é apagado
//        alunoTads = hana;
//
//        System.out.println(hana);
//        System.out.println(alunoTads);


        //2 PARTE DA AULA

        Curso tads, mecanica, civil, gastronomia;
        Instituicao ifam;
        ifam = new Instituicao();
        gastronomia = new Curso();

        hana.curso = gastronomia;
        gastronomia.nome = "Bacharelado em Gastronomia";
        hana.nome = "Hana Yasmim B. de Medeiros";
        hana.curso.instituicao = ifam;
        hana.curso.instituicao.setNome("Intituto federal do amazonas");
//      hana.curso.instituicao.nome = "Intituto federal do amazonas";

        System.out.printf("%s\n", hana.curso.nome);
        System.out.printf("%s", hana.curso.instituicao.nome);





//        System.out.printf("\n faz  no %s", hana.curso.instituicao.nome);

//        System.out.printf("\n %s faz %s no %s", hana.nome, hana.curso.nome, hana.curso.instituicao.nome);





    }
}
