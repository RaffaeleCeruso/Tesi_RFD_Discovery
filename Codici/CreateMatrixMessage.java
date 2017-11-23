ActorRef actor=this.getContext().actorOf(ConcurrentDMActor.props());
actor.tell(new CreateConcurrentDM
                (inizioCorrente,dimension,this.df), this.getSelf());
