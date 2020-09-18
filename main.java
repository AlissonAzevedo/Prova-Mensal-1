public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op;
 
        
        ArrayList<produtosVendidos> produtos = new ArrayList<produtosVendidos>();
        produtosVendidos produto = new produtosVendidos("",0.0f,0);
        System.out.println("Digite a opçao: ");
        System.out.println("1 - Adicionar um novo produto ");
        System.out.println("2 - Estoque ");
        

        opcao = entrada.nextInt();
        switch (op)
        {
            case 1:
            break;
            case 2:
                produto.ListaEstoque();
            break;

        }

       

    }
}