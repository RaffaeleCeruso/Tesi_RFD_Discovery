
/**
 * Metodo che riceve in input nome del file csv e lo carica 
 * in un DataFrame
 * @param nameCSV nome file CSV
 * @param separator separatore di colonne utilizzato nel file
 * @param naString stringa nulla
 * @param hasHeader presenza di header nel file
 * @return Dataframe  DataFrame caricato da file
 * @throws IOException
 */
 public static DataFrame<Object> loadDF(String nameCSV,
 										String separator,
                                        String naString,
                                        boolean hasHeader,
                                        int righeTaglio)
