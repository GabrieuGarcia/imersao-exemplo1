package br.com.tt.exerciciobanco.enumeration;

public enum TipoDocumentoEnum {
    RG,
    CPF,
    CNH;

    public static String getValues() {
        String valores = "";
        for(TipoDocumentoEnum tipoDocumentoEnum : values()) {
            valores += tipoDocumentoEnum.name() + "\n";
        }
        return valores;
    }


}
