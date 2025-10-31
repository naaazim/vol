interface Reduction{
	double getPrix();
	void appliquerReduction(double prix) throws ReductionInvalideException;
	default void reduction(double prix)throws ReductionInvalideException{
		if(prix < 0 || prix > getPrix()) throw new ReductionInvalideException("La réduction doit être > 0 et < au prix actuel");
		appliquerReduction(prix);
	}
	default void reductionPourcentage(double pourcentage) throws ReductionInvalideException{
		if(pourcentage < 0 || pourcentage > 100)throw new ReductionInvalideException("Le pourcentage est invalide");
		appliquerReduction( getPrix() * (pourcentage/100) );
	}
}
