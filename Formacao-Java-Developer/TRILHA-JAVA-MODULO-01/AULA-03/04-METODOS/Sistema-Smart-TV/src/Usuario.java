public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        // Testando liga e desliga
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada : " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada : " + smartTv.ligada);

        // Testando o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + +smartTv.volume);

        // Testando o canal
        smartTv.mudarCanal(11);
        System.out.println("Canal atual : " + +smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual : " + +smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual : " + +smartTv.canal);
    }
}
