//Gestione last steps e risposta al mittente
return receiveBuilder()
   .match(CreateLastSteps.class, lsps->
   {
      this.getSender().tell(new MainActor
        .ReceiveLastSteps(MinimalityAndGenerationRFD
          .startMinimalityAndGeneration
            (lsps.allC,lsps.colonne,lsps.orderedDM,lsps.dM),
                       lsps.orderedDM.getRhs()),this.getSelf());
   }).build();
