/*
 * Chiama metodo per la creazionedella DM parziale e
 * la invia al MainActor
*/
return receiveBuilder().match(CreateConcurrentDM.class, c->
{
   this.getSender().tell(new ReceivePartDM(DistanceMatrix
          .concurrentCreateMatrix(c.inizio,
					              c.dimensione,
					          	  c.completeDF)),
            					  this.getSelf());
}).build();
