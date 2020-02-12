
package prjhospital;


public class Paciente extends Pessoa{
    private int CodPaciente;
    private String senha;
    
public int getCodPaciente(){
 return this.CodPaciente;
}
public void setCodPaciente(int CodPaciente){
this.CodPaciente=CodPaciente;
}
   
public String getsenha(){
 return this.senha;
}
public void setsenha(String senha){
this.senha=senha;
}
}
