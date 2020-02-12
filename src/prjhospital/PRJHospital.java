
package prjhospital;


public class PRJHospital {
    
   
       
    public static void main(String[] args) {
        Enfermeiro e1 = new Enfermeiro();
        
        e1.setnome("Oswaldo");
        e1.setidade(29);
        e1.setcpf("001.110.000.12");
        e1.setRG("17.853.883-8");
        e1.setmatricula(00001);
        e1.setsenha("Tamaringo");
        e1.setCOREN("123.321");
        
        Medico m = new Medico();
        
        m.setnome("Hudson");
        m.setidade(33);
        m.setcpf("147.821.568.20");
        m.setRG("13.266.471-9");
        m.setsenha("batatao");
        m.setCRM("555.555");
        m.setmatricula(00003);
        m.setEspecialidade("Cirurgião");
        
        Paciente p = new Paciente();
        
        p.setnome("SR.Pombisco");
        p.setidade(55);
        p.setcpf("666.666.666.66");
        p.setRG("89.888.888.8");
        p.setCodPaciente(5000);
        p.setsenha("100");
     
        
        System.out.println("ENFERMEIRO \n");
        
        System.out.println("Nome : " + e1.getnome());
        System.out.println("Idade : " + e1.getidade());
        System.out.println("RG: " + e1.getRG());
        System.out.println("CPF: " + e1.getcpf());
        System.out.println("COREN: " + e1.getCOREN());
        System.out.println("Matricula: "+ e1.getmatricula());
        System.out.println("Senha:" + e1.getsenha());
        
        System.out.println("\n Medico \n");
        
        System.out.println("Nome : " + m.getnome());
        System.out.println("Idade : " + m.getidade());
        System.out.println("RG: " + m.getRG());
        System.out.println("CPF: " + m.getcpf());
        System.out.println("Matricula: "+ m.getmatricula());
        System.out.println("Senha:" + m.getsenha());
        System.out.println("Especialidade: " + m.getEspecialidade());
        System.out.println("CRM: " + m.getCRM());
        
        System.out.println("\n Paciente \n");
        
        System.out.println("Nome : " + p.getnome());
        System.out.println("Idade : " + p.getidade());
        System.out.println("RG: " + p.getRG());
        System.out.println("CPF: " + p.getcpf());
        System.out.println("Codigo Paciente: " + p.getCodPaciente());
        System.out.println("Senha: " + p.getsenha());
        
    }
    
}
