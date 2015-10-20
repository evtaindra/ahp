/**
 *
 * $Id$
 */
package ahp.validation;

import ahp.Alternative;
import ahp.Criterion;

/**
 * A sample validator interface for {@link ahp.CriterionAlternative}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CriterionAlternativeValidator {
	boolean validate();

	boolean validateCriterion(Criterion value);
	boolean validateAlternative(Alternative value);
}