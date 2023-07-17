package project.models;

public class ResultsHolder {
	
	private int numIteration;
	private String classifier;
	private boolean featureSelection;
	private boolean underSampl;
	private boolean overSampl;
	private boolean costSensitive;
	private double precision;
	private double recall;
	private double auc;
	private double kappa;
	
	public ResultsHolder(int index, String classifier, boolean featureSelection, boolean underSampl, boolean overSampl, boolean costSensitive) {
		this.numIteration = index;
		this.classifier = classifier;
		this.featureSelection = featureSelection;
		this.underSampl = underSampl;
		this.costSensitive = costSensitive;
		this.overSampl = overSampl;
		this.precision = 0;
		this.recall = 0;
		this.auc = 0;
		this.kappa = 0;
		
	}

	/**
	 * @return the walkForwardIterationIndex
	 */
	public int getNumIteration() {
		return numIteration;
	}
	/**
	 * @param numIteration the walkForwardIterationIndex to set
	 */
	public void setNumIteration(int numIteration) {
		this.numIteration = numIteration;
	}
	/**
	 * @return the classifier
	 */
	public String getClassifier() {
		return classifier;
	}
	/**
	 * @param classifier the classifier to set
	 */
	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}
	/**
	 * @return the featureSelection
	 */
	public boolean isFeatureSelection() {
		return featureSelection;
	}
	/**
	 * @param featureSelection the featureSelection to set
	 */
	public void setFeatureSelection(boolean featureSelection) {
		this.featureSelection = featureSelection;
	}
	/**
	 * @return the sampling
	 */
	public boolean isUnderSampl() {
		return underSampl;
	}
	/**
	 * @param underSampl the sampling to set
	 */
	public void setUnderSampl(boolean underSampl) {
		this.underSampl = underSampl;
	}
	public boolean isOverSampl(){ return overSampl;}
	/**
	 * @return the costSensitive
	 */
	public boolean isCostSensitive() {
		return costSensitive;
	}

	/**
	 * @param costSensitive the costSensitive to set
	 */
	public void setCostSensitive(boolean costSensitive) {
		this.costSensitive = costSensitive;
	}

	/**
	 * @return the precision
	 */
	public double getPrecision() {
		return precision;
	}
	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(double precision) {
		this.precision = precision;
	}
	/**
	 * @return the recall
	 */
	public double getRecall() {
		return recall;
	}
	/**
	 * @param recall the recall to set
	 */
	public void setRecall(double recall) {
		this.recall = recall;
	}
	/**
	 * @return the auc
	 */
	public double getAuc() {
		return auc;
	}
	/**
	 * @param auc the auc to set
	 */
	public void setAuc(double auc) {
		this.auc = auc;
	}
	/**
	 * @return the kappa
	 */
	public double getKappa() {
		return kappa;
	}
	/**
	 * @param kappa the kappa to set
	 */
	public void setKappa(double kappa) {
		this.kappa = kappa;
	}

}
