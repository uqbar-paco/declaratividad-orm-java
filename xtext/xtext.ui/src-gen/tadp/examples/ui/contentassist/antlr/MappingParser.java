/*
* generated by Xtext
*/
package tadp.examples.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import tadp.examples.services.MappingGrammarAccess;

public class MappingParser extends AbstractContentAssistParser {
	
	@Inject
	private MappingGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected tadp.examples.ui.contentassist.antlr.internal.InternalMappingParser createParser() {
		tadp.examples.ui.contentassist.antlr.internal.InternalMappingParser result = new tadp.examples.ui.contentassist.antlr.internal.InternalMappingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
					put(grammarAccess.getMappingAccess().getGroup_2(), "rule__Mapping__Group_2__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_2(), "rule__Property__Group_2__0");
					put(grammarAccess.getPropertyAccess().getGroup_3(), "rule__Property__Group_3__0");
					put(grammarAccess.getMappingAccess().getNameAssignment_1(), "rule__Mapping__NameAssignment_1");
					put(grammarAccess.getMappingAccess().getTableAssignment_2_1(), "rule__Mapping__TableAssignment_2_1");
					put(grammarAccess.getMappingAccess().getPropertiesAssignment_4(), "rule__Mapping__PropertiesAssignment_4");
					put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_2_1(), "rule__Property__TypeAssignment_2_1");
					put(grammarAccess.getPropertyAccess().getColumnAssignment_3_1(), "rule__Property__ColumnAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			tadp.examples.ui.contentassist.antlr.internal.InternalMappingParser typedParser = (tadp.examples.ui.contentassist.antlr.internal.InternalMappingParser) parser;
			typedParser.entryRuleMapping();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
