package org.example.data.SQLs;

public class Update_ValorFinal_PREVENDA {
    public static String querye =
                "-- VALORES PARA SEREM ATUALIZADOS\n" +
                        "DECLARE @PREVENDA\t NUMERIC(15)   = ?\n" +
                        "DECLARE @VALOR_FINAL NUMERIC(15,2) = ?\n" +
                        "--NÃO ATUALIZAR\n" +
                        "DECLARE @TOTAL_BRUTO\tNUMERIC(15,2)\n" +
                        "DECLARE @TOTAL_DESCONTO NUMERIC(15,2)\n" +
                        "DECLARE @TOTAL_BRUTO_1\t  NUMERIC(15,2)\n" +
                        "DECLARE @TOTAL_DESCONTO_1 NUMERIC(15,2)\n" +
                        "SELECT \n" +
                        "\t@TOTAL_BRUTO\t= TOTAL_BRUTO,\n" +
                        "\t@TOTAL_DESCONTO = (@TOTAL_BRUTO - @VALOR_FINAL)\n" +
                        "FROM \n" +
                        "\tPREVENDAS\n" +
                        "WHERE\n" +
                        "\tPREVENDA = @PREVENDA\n" +
                        "--ALTERAR OS VALORES DA PREVENDA\n" +
                        "UPDATE A\n" +
                        "SET\n" +
                        "\tTOTAL_DESCONTO = @TOTAL_DESCONTO,\n" +
                        "\tTOTAL_LIQUIDO  = @VALOR_FINAL\n" +
                        "FROM\n" +
                        "\tPREVENDAS A\n" +
                        "WHERE\n" +
                        "\tA.PREVENDA = @PREVENDA\n" +
                        "--ZERAR OS DESCONTOS DOS PRODUTOS E ORGANIZAR VALORES\n" +
                        "UPDATE A\n" +
                        "SET\n" +
                        "\tDESCONTO = 0,\n" +
                        "\tPRECO_LIQUIDO = PRECO_BRUTO,\n" +
                        "\tTOTAL_ITEM = (QUANTIDADE * PRECO_BRUTO)\n" +
                        "FROM\n" +
                        "\tPREVENDAS_ITENS A\n" +
                        "WHERE\n" +
                        "\tA.PREVENDA = @PREVENDA\n" +
                        "--CORRIGIR OS VALORES DOS DESCONTOS\n" +
                        "UPDATE A\n" +
                        "SET\n" +
                        "\tDESCONTO\t\t= (@TOTAL_DESCONTO / @TOTAL_BRUTO) * PRECO_BRUTO\n" +
                        "FROM\n" +
                        "\tPREVENDAS_ITENS A\n" +
                        "WHERE\n" +
                        "\tA.PREVENDA = @PREVENDA\n" +
                        "--CORRIGE O PREÇO LIQUIDO\n" +
                        "UPDATE A\n" +
                        "SET\n" +
                        "\tPRECO_LIQUIDO\t= (PRECO_BRUTO - DESCONTO),\n" +
                        "\tTOTAL_ITEM\t\t= (PRECO_LIQUIDO * A.QUANTIDADE)\n" +
                        "FROM\n" +
                        "\tPREVENDAS_ITENS A\n" +
                        "WHERE\n" +
                        "\tA.PREVENDA = @PREVENDA\n" +
                        "--CORRIGE O TOTAL ITEN\n" +
                        "UPDATE A\n" +
                        "SET\n" +
                        "\tTOTAL_ITEM\t\t= (PRECO_LIQUIDO * A.QUANTIDADE)\n" +
                        "FROM\n" +
                        "\tPREVENDAS_ITENS A\n" +
                        "WHERE\n" +
                        "\tA.PREVENDA = @PREVENDA\n" +
                        "--CORRIGE O CANAL DE VENDA PARA VENDA DO ECOMMERCE\n" +
                        "UPDATE A\n" +
                        "SET\n" +
                        "\tCANAL_VENDA\t\t= '5'\n" +
                        "FROM\n" +
                        "\tPREVENDAS A\n" +
                        "WHERE\n" +
                        "\tA.PREVENDA = @PREVENDA\n" +
                        "SELECT CANAL_VENDA, * FROM PREVENDAS\t\t  WHERE PREVENDA = @PREVENDA\n" +
                        "SELECT * FROM PREVENDAS_ITENS WHERE PREVENDA = @PREVENDA\n" +
                        "--VIZUALIZAR RESULTADOS\n" +
                        "SELECT \n" +
                        "\tCAST (SUM(QUANTIDADE * DESCONTO) AS NUMERIC(15,2)) AS DESCONTO ,\n" +
                        "\tSUM(TOTAL_ITEM) AS TOTAL \n" +
                        "FROM \n" +
                        "\tPREVENDAS_ITENS \n" +
                        "WHERE \n" +
                        "\tPREVENDA = @PREVENDA\n";
}
