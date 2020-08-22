package proxy;
public class Cliente {
    public static void main(String[] args) {
        Consulta consulta = new ConsultaProxy("Vitor Hugo"); 
        //Consulta vai chamar carregarConsulta
        consulta.Consultar();
        System.out.println("");
        //Com o objeto criado nao vai chamar o carregarConsulta mais
        consulta.Consultar();
    }
    
}
