import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    Impressora impressora = new Impressora();
    void menuImpresso(){
        System.out.println("---Menu---");
        System.out.println("1 - Configurar Conexão");
        System.out.println("2 - Abrir Conexão");
        System.out.println("3 - Impressão código de barras");
        System.out.println("4 - Impressão QRCode");
        System.out.println("5 - Sinal sonoro");
        System.out.println("6 - Impressão Texto");
        System.out.println("7 - Modo página");
        System.out.println("8 - Modo padrão");
        System.out.println("9 - Limpar buffer");
        System.out.println("10 - Fechar Conexão\n");
    }

    void menuImpressora(){

        while (true){
            menuImpresso();
            System.out.println("Digite a opção desejada\n");
            int opc = input.nextInt();

            switch (opc) {
                case 1:
                    impressora.configurarImpressora();
                    break;

                case 2:
                    impressora.abrirConexao();
                    break;

                case 3:
                    impressora.impressaoCodigoBarras();
                    break;

                case 4:
                    impressora.impressaoQrcode();
                    break;

                case 5:
                    impressora.sinalSonoro();
                    break;

                case 6:
                    impressora.impressaoTexto();
                    break;

                case 7:
                    impressora.modoPagina();
                    break;

                case 8:
                    impressora.modoPadrao();
                    break;

                case 9:
                    impressora.limpaBuffer();
                    break;

                case 10:
                    impressora.fecharConexao();
                    break;
            }
        }
    }
}