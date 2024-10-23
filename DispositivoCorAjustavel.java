public interface DispositivoCorAjustavel extends Dispositivo {
    
    @Override
    public void ligue();
    
    @Override 
    public void desligue();
    
    public void ajustaCor();
    
    public void ajustaPotencia();
    
}
