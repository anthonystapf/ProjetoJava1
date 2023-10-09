# ProjetoJava1
```Java
public class Pessoa {
    private String nome;
    private int idade;
    private String EstadoCivil;
    private String Data;
    private String CPF;
    private String RG;
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setEstadoCivil(String EstadoCivil){
        this.EstadoCivil = EstadoCivil;
    }

    public void setData(String Data){
        this.Data = Data;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void setRG(String RG){
        this.RG = RG;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String getEstadoCivil(){
        return EstadoCivil;
    }
    
    public String getData(){
        return Data;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public String getRG(){
        return RG;
    }
}

public class Principal {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        
        
        novaPessoa.setNome("Elvis");
        novaPessoa.setIdade(30);
        novaPessoa.setEstadoCivil("Solteiro");
        novaPessoa.setData("05/08/1985");
        novaPessoa.setCPF("000.000.000-00");
        novaPessoa.setRG("00.000.000-0");
        
        System.out.println("Novo Nome: " + novaPessoa.getNome());
        System.out.println("Nova Idade: " + novaPessoa.getIdade());
        System.out.println("Novo Nome: " + novaPessoa.getNome());
        System.out.println("Nova Idade: " + novaPessoa.getIdade());
        System.out.println("Nova EstadoCivil: " + novaPessoa.getEstadoCivil());
        System.out.println("Nova Data: " + novaPessoa.getData());
        System.out.println("Nova CPF: " + novaPessoa.getCPF());
        System.out.println("Nova RG: " + novaPessoa.getRG());
            
    }
}
```
