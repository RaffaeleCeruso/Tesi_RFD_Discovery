//Gestione feasibility test e risposta al mittente
return receiveBuilder()
   .match(CreateFeasibiity.class, cf->
   {
       OrderedDM dm = cf.orderedDM;
       Object2ObjectOpenHashMap<String,ObjectArrayList<Tuple>> hMap =
                   FeasibilityOrderedDM.feasibilityTest(dm,cf.dmGenerale);
       dm.setInsiemeC(hMap);
       this.getSender().tell(new MainActor.ReciveFeasibility(dm),
                                                    this.getSelf());
	 }).build();
