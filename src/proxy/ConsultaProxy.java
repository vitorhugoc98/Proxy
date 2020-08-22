package proxy;
public class ConsultaProxy implements Consulta{
    
    private ConsultaReal consultaReal; 
    
    private String consulta; 
    
    public ConsultaProxy(String consulta) {
        this.consulta = consulta; 
    }

    @Override
    public void Consultar() {
        if(consultaReal == null){
            consultaReal = new ConsultaReal(consulta); 
        }
        consultaReal.Consultar();
    }
    
    
}
