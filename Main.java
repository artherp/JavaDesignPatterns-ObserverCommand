
import java.util.ArrayList;

/*
*  Se você está realizando esta avaliação em dupla, 
*  coloque o nome do outro aluno (que não está logado no Moodle) abaixo.
*  Se você está realizando esta avaliação sozinho, não preencha o nome abaixo.
*  Nome completo: 
 */
public class Main {

    public static void main(String[] args) {

        // Você deve criar uma televisão, uma caixa de som e uma lâmpada RGB
        /* complete */
        CaixaDeSom caixa = new CaixaDeSom();
        Televisao tv = new Televisao();
        LampadaRGB lamp = new LampadaRGB();

        // Cria serviços (desvinculados das classes que executam os serviços e das classes que invoccam os serviços)
        // Você deve criar instâncias com cada um dos serviços de cada um dos dispositivos
        /* complete */
        Servico ligueTV = new ServicoLigue(tv);
        Servico ligueCaixa = new ServicoLigue(caixa);
        Servico ligueLampadaRGB = new ServicoLigue(lamp);
        Servico ajusteVolumeCaixaSom = new ServicoAjustePotencia(caixa);
        Servico ajusteVolumeTelevisao = new ServicoAjustePotencia(tv);
        Servico ajusteCanalTelevisao = new ServicoMudeCanal(tv);
        Servico ajusteBrilhoLampada = new ServicoAjusteCor(lamp);
        Servico ajusteCorLampada = new ServicoAjusteCor(lamp);
        Servico desligueTelevisao = new ServicoDesligue(tv);
        Servico desligueCaixaDeSom = new ServicoDesligue(caixa);
        Servico desligueLampadaRGB = new ServicoDesligue(lamp);

        // Cria a alexa (invocador dos serviços, desvinculado dos serviços e de quem executa os serviços)
        // Cria um assiste de invocação e registre esse assistente como observador de cada um dos dispositivos
        ArrayList<Servico> alexa = new ArrayList<>();
        
        AssistenteDeInvocacao assistente = new AssistenteDeInvocacao();
        tv.addObserver(assistente);
        caixa.addObserver(assistente);
        lamp.addObserver(assistente);
        
        alexa.add(ligueTV);
        alexa.add(ligueCaixa);
        alexa.add(ligueLampadaRGB);
        alexa.add(ajusteVolumeCaixaSom);
        alexa.add(ajusteVolumeTelevisao);
        alexa.add(ajusteCanalTelevisao);
        alexa.add(ajusteBrilhoLampada);
        alexa.add(ajusteCorLampada);
        alexa.add(desligueTelevisao);
        alexa.add(desligueCaixaDeSom);
        alexa.add(desligueLampadaRGB);

        // Invocador dispara serviços para serem executados pelos receptores dos serviços)
        // Você deve fazer com que o assistente execute cada um dos serviços em cada um dos dispositivos,
        // na seguinte ordem: ligueTelevisao, ligueCaixaDeSom, ligueLampadaRGB, ajusteVolumeCaixaSom,
        // ajusteVolumeTelevisao, ajusteCanalTelevisao, ajusteBrilhoLampada, ajusteCorLampada, 
        // desligueTelevisao, desligueCaixaDeSom, desligueLampadaRGB
        /* complete */
        alexaExecuter(alexa);

    }

    public static void alexaExecuter(ArrayList<Servico> alexaCommands) {
        for (Servico comando : alexaCommands) {
            comando.execute();
        }
    }
}
