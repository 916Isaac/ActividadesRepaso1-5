public class Time {

    private int hora;
    private int minuto;
    private int segundo;

    public Time(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    Time nextSecond(){
        segundo++;
        if (segundo >= 60){
            minuto++;
            segundo = 0;
            if (minuto >= 60){
                hora++;
                minuto =0;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
        return new Time(hora, minuto, segundo);
    }
    public boolean equals(Object o) {
        if (o instanceof Time) {
            Time tiempo = (Time) o;
            return this.hora == tiempo.getHora() &&
                    this.minuto == tiempo.getMinuto() &&
                    this.segundo == tiempo.getSegundo();
        }
        return false;
    }
}
