/**
 * @param inizio Indice di riga iniziale da confrontare
 * @param dimensione Indice di numero righe da confrontare
 * @param df dataFrame in input
 * @return Matrice Delle Distanze
 * Metodo per la creazione della matrice delle distanze.
 * Effettua anche taglio dei duplicati.
 * Versione per la parallelizzazione.
*/
public static DataFrame<Object> concurrentCreateMatrix
                                       (int inizio,int dimensione,
                                           DataFrame<Object> completeDF)
