
package prjhospital;


public class Funcionario extends Pessoa{
    private int matricula;
    private String senha;
    
    public int getmatricula(){
    return matricula;
    }
    public void setmatricula(int matricula){
    this.matricula=matricula;
    }
    
    public String getsenha(){
    return senha;
    }
    public void setsenha(String senha){
    this.senha=senha;
    }
}
