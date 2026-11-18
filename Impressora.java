import java.util.Scanner

public class Impressora {

    static boolean conexaoAberta = false;
    static int tipo;
    static String modelo;
    static String conexao;
    static int parametro;
    static Scanner input = new Scanner(System.in);

    void configurarImpressora() {
        try {
            System.out.println("Digite o tipo: \n");
            tipo = input.nextInt();

            System.out.println("Digite o modelo: \n");
            modelo = input.next();

            System.out.println("Digite a conexão: \n");
            conexao = input.next();

            System.out.println("Digite o parametro: \n");
            parametro = input.nextInt();

            System.out.println("Dados armazenados com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao configurar impressora: " + e.getMessage());
        }
    }

    void abrirConexao() {
        try {
            if (!conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.AbreConexaoImpressora(
                        tipo, modelo, conexao, parametro
                );

                if (ret == 0) {
                    conexaoAberta = true;
                    System.out.println("Conexão aberta com sucesso!");
                } else {
                    System.out.println("Erro ao abrir conexão. Retorno: " + ret);
                }

            } else {
                System.out.println("Já existe uma comunicação aberta!");
            }

        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void impressaoCodigoBarras() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.ImpressaoCodigoBarras(
                        8, "{AB12345678912", 100, 2, 2
                );

                if (ret == 0) {
                    ImpressoraDLL.INSTANCE.Corte(3);
                    System.out.println("Código de barras imprimido com sucesso!");
                } else {
                    System.out.println("Erro ao imprimir código de barras. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro na impressão do código de barras: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void impressaoQrcode() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.ImpressaoQRCode(
                        "Richard bobão", 3, 3
                );

                if (ret == 0) {
                    ImpressoraDLL.INSTANCE.Corte(3);
                    System.out.println("QRCode imprimido com sucesso!");
                } else {
                    System.out.println("Erro ao imprimir QRCode. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro na impressão do QRCode: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void sinalSonoro() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.SinalSonoro(33, 12, 17);

                if (ret == 0) {
                    System.out.println("Som emitido com sucesso!");
                } else {
                    System.out.println("Erro ao emitir som. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao emitir sinal sonoro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void impressaoTexto() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.ImpressaoTexto(
                        "Richard bobo", 1, 8, 16
                );

                if (ret == 0) {
                    System.out.println("Texto imprimido com sucesso!");
                } else {
                    System.out.println("Erro ao imprimir texto. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao imprimir texto: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void modoPagina() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.ModoPagina();

                if (ret == 0) {
                    System.out.println("Modo página ativado!");
                } else {
                    System.out.println("Erro ao ativar o modo página. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao ativar modo página: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void modoPadrao() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.ModoPadrao();

                if (ret == 0) {
                    System.out.println("Modo padrão ativado!");
                } else {
                    System.out.println("Erro ao ativar o modo padrão. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao ativar modo padrão: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void limpaBuffer() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.LimpaBufferModoPagina();

                if (ret == 0) {
                    System.out.println("Buffer limpo!");
                } else {
                    System.out.println("Erro ao limpar buffer. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao limpar buffer: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void fecharConexao() {
        try {
            if (conexaoAberta) {
                int ret = ImpressoraDLL.INSTANCE.FechaConexaoImpressora();

                if (ret == 0) {
                    conexaoAberta = false;
                    System.out.println("Conexão encerrada com sucesso!");
                } else {
                    System.out.println("Erro ao encerrar conexão. Retorno: " + ret);
                }

            } else {
                System.out.println("Não existe uma comunicação em aberto.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
