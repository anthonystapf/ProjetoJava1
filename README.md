# ProjetoJava1
```Java
public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;  
    }
}

public class Principal {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        
        
        novaPessoa.setNome("Elvis");
        novaPessoa.setIdade(30);
        
        System.out.println("Novo Nome: " + novaPessoa.getNome());
        System.out.println("Nova Idade: " + novaPessoa.getIdade());
            
    }
}
```
