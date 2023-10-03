
public class Principal {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        
        System.out.println("Nome: " + novaPessoa.getNome());
        System.out.println("Idade: " + novaPessoa.getIdade());
        
        novaPessoa.setNome("Elvis");
        novaPessoa.setIdade(30);
        
        System.out.println("Novo Nome: " + novaPessoa.getNome());
        System.out.println("Nova Idade: " + novaPessoa.getIdade());
        
        
    }
}
