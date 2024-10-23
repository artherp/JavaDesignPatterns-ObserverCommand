public interface DispositivoPotenciaAjustavel extends Dispositivo {
    @Override
    public void ligue();
    
    @Override
    public void desligue();
    
    public void ajustaPotencia();
    
}
