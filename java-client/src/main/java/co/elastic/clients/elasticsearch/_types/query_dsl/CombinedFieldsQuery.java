/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.CombinedFieldsQuery

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/query_dsl/abstractions.ts#L178-L192">API
 *      specification</a>
 */
@JsonpDeserializable
public class CombinedFieldsQuery extends QueryBase implements QueryVariant {
	private final List<String> fields;

	private final String query;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final CombinedFieldsOperator operator;

	@Nullable
	private final String mimimumShouldMatch;

	@Nullable
	private final CombinedFieldsZeroTerms zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	private CombinedFieldsQuery(Builder builder) {
		super(builder);

		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.operator = builder.operator;
		this.mimimumShouldMatch = builder.mimimumShouldMatch;
		this.zeroTermsQuery = builder.zeroTermsQuery;

	}

	public static CombinedFieldsQuery of(Function<Builder, ObjectBuilder<CombinedFieldsQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.CombinedFields;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * API name: {@code auto_generate_synonyms_phrase_query}
	 */
	@Nullable
	public final Boolean autoGenerateSynonymsPhraseQuery() {
		return this.autoGenerateSynonymsPhraseQuery;
	}

	/**
	 * API name: {@code operator}
	 */
	@Nullable
	public final CombinedFieldsOperator operator() {
		return this.operator;
	}

	/**
	 * API name: {@code mimimum_should_match}
	 */
	@Nullable
	public final String mimimumShouldMatch() {
		return this.mimimumShouldMatch;
	}

	/**
	 * API name: {@code zero_terms_query}
	 */
	@Nullable
	public final CombinedFieldsZeroTerms zeroTermsQuery() {
		return this.zeroTermsQuery;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.autoGenerateSynonymsPhraseQuery != null) {
			generator.writeKey("auto_generate_synonyms_phrase_query");
			generator.write(this.autoGenerateSynonymsPhraseQuery);

		}
		if (this.operator != null) {
			generator.writeKey("operator");
			this.operator.serialize(generator, mapper);
		}
		if (this.mimimumShouldMatch != null) {
			generator.writeKey("mimimum_should_match");
			generator.write(this.mimimumShouldMatch);

		}
		if (this.zeroTermsQuery != null) {
			generator.writeKey("zero_terms_query");
			this.zeroTermsQuery.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CombinedFieldsQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CombinedFieldsQuery> {
		private List<String> fields;

		private String query;

		@Nullable
		private Boolean autoGenerateSynonymsPhraseQuery;

		@Nullable
		private CombinedFieldsOperator operator;

		@Nullable
		private String mimimumShouldMatch;

		@Nullable
		private CombinedFieldsZeroTerms zeroTermsQuery;

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code auto_generate_synonyms_phrase_query}
		 */
		public final Builder autoGenerateSynonymsPhraseQuery(@Nullable Boolean value) {
			this.autoGenerateSynonymsPhraseQuery = value;
			return this;
		}

		/**
		 * API name: {@code operator}
		 */
		public final Builder operator(@Nullable CombinedFieldsOperator value) {
			this.operator = value;
			return this;
		}

		/**
		 * API name: {@code mimimum_should_match}
		 */
		public final Builder mimimumShouldMatch(@Nullable String value) {
			this.mimimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code zero_terms_query}
		 */
		public final Builder zeroTermsQuery(@Nullable CombinedFieldsZeroTerms value) {
			this.zeroTermsQuery = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CombinedFieldsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CombinedFieldsQuery build() {
			_checkSingleUse();

			return new CombinedFieldsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CombinedFieldsQuery}
	 */
	public static final JsonpDeserializer<CombinedFieldsQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CombinedFieldsQuery::setupCombinedFieldsQueryDeserializer);

	protected static void setupCombinedFieldsQueryDeserializer(ObjectDeserializer<CombinedFieldsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::operator, CombinedFieldsOperator._DESERIALIZER, "operator");
		op.add(Builder::mimimumShouldMatch, JsonpDeserializer.stringDeserializer(), "mimimum_should_match");
		op.add(Builder::zeroTermsQuery, CombinedFieldsZeroTerms._DESERIALIZER, "zero_terms_query");

	}

}
