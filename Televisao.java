public class Televisao extends Observable implements DispositivoPotenciaAjustavel {
    @Override
    public void ligue() {
        System.out.println("A televisão está ligada"); /* não modifique */
        setChanged();
        notifyObservers();
    }

    @Override
    public void desligue() {
        System.out.println("A televisão está desligada"); /* não modifique */
        setChanged();
         notifyObservers();
    }

    public void mudeCanal() {
        System.out.println("O canal da televisão foi alterado"); /* não modifique */
        setChanged();
         notifyObservers();
    }

    @Override
    public void ajustaPotencia() {
        System.out.println("volume da televisão foi ajustado");  /* não modifique */
        setChanged();
         notifyObservers();
    }
}
