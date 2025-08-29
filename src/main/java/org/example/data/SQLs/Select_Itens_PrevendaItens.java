package org.example.data.SQLs;

public class Select_Itens_PrevendaItens {
    public static String querye =
            "SELECT \n" +
            "\tPREVENDA_ITEM,\n" +
            "\tPREVENDA,\n" +
            "\tITEM,\n" +
            "\tPRODUTO,\n" +
            "\tQUANTIDADE,\n" +
            "\tPRECO_BRUTO,\n" +
            "\tDESCONTO,\n" +
            "\tPRECO_LIQUIDO,\n" +
            "\tTOTAL_ITEM\n" +
            "FROM PREVENDAS_ITENS\n" +
            "WHERE PREVENDA = ?";
}
