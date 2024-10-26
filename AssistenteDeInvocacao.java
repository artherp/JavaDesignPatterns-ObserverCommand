public class AssistenteDeInvocacao implements Observer {
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("O dispositivo foi atualizado"); /* não modifique */
    }
}
