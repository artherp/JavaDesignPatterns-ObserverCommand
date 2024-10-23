public class AssistenteDeInvocacao implements Observer {
    
    public void executarComando(Servico instrucao) {
        instrucao.execute();
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("O dispositivo foi atualizado"); /* não modifique */
    }
}
