public class ex004 {
    public static void main(String[] args) {
        int hora = 19;
        int minutos = 50;
        System.out.println(converter(hora, minutos));

    }
    public static String converter(int hora, int minutos){
        if (hora > 12){
            hora -= 12;
            String periodo = "PM";
            String horarioFormatado = hora + ":" + minutos + " " + periodo;
            return horarioFormatado;
        }
        else{
            String periodo = "AM";
            String horarioFormatado = hora + ":" + minutos + " " + periodo;
            return horarioFormatado;
        }
    }
}
