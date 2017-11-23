//crea DM ordinata e la spedisce al mittente
return receiveBuilder()
.match(CreateOrderedDM.class, c->
{
     this.getSender().tell(new ReceiveOrderedDM
        (DistanceMatrix.createOrderedDM(c.indiceRHS, c.dm)),
                                               this.getSelf());
}).build();
