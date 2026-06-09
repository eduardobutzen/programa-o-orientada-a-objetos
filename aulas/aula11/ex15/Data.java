public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void validarData() {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido.");
        }
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido.");
        }
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido.");
        }
        
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        if (mes == 2) {
            if (bissexto && dia > 29) {
                throw new IllegalArgumentException("Data inválida para ano bissexto.");
            } else if (!bissexto && dia > 28) {
                throw new IllegalArgumentException("Data inválida para o mês de fevereiro.");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                throw new IllegalArgumentException("Mês possui apenas 30 dias.");
            }
        }
    }
}
