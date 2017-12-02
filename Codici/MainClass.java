df = DistanceMatrix.loadDF(args[0],
	args[3],
	args[4],
	true,
	Integer.parseInt(args[1]));

ActorSystem system = ActorSystem.create("SistemaAttoriRDF");

ActorRef act=system.actorOf(MainActor.
	props(df,Integer.parseInt(args[2])),"AttorePrincipale");

act.tell(new MainActor.ConcurrenceDistanceMatrix(), ActorRef.noSender());
