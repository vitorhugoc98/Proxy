package proxy;
public class ConsultaReal implements Consulta{
    
    private String consulta; 
    
    public ConsultaReal(String consulta) {
        this.consulta = consulta; 
        carregarConsulta(consulta); 
    }
    
    @Override
    public void Consultar() {
        System.out.println("Resultado da consulta: "+consulta+" 'reslutado da consuta aqui'");
    }
    
    private void carregarConsulta(String consulta){ 
        System.out.println("Consultando ... "+consulta);
    }
    
}
