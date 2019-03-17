package test;

	

	/**
	 * DEPRECATED since 2014-11: please use {@link ProtocolNode#matchAs} with {@link JiveCoreMatchTypes} instead.<br>
	 * Special values used in matching.
	 *
	 * @deprecated
	 *
	 * @since 2.0.0
	 */
	@Deprecated
	public interface MatchValue {
	    @Deprecated
	    class EnumValue implements MatchValue {

	        private final MatchType type;

	        public EnumValue(MatchType name) {
	            type = name;
	        }

	        @Override
	        public String name() {
	            return type.name();
	        }

	        @Override
	        public String toString() {
	            return "Match value: " + name();
	        }
	    }

	    /**
	     * Used when the actual value compares with expected value using the 'equals' method. Default value for {@link ProtocolNode} and
	     * {@link GenericNode},
	     */
	    public static final MatchValue VALUE = new EnumValue(MatchType.VALUE);

	    /**
	     * Used when the actual value can be anything or empty (including 'null').
	     */
	    public static final MatchValue ANY_OR_EMPTY = new EnumValue(MatchType.ANY_OR_EMPTY);

	    /**
	     * Used when the actual value can be anything but not empty or null.
	     */
	    public static final MatchValue ANY_NOT_EMPTY = new EnumValue(MatchType.ANY_NOT_EMPTY);

	    /**
	     * Used to match specific elements within collections.
	     */
	    public static final MatchValue COLLECTION_WITH_PERMUTATION = new EnumValue(MatchType.COLLECTION_WITH_PERMUTATION);

	    /**
	     * Used when the actual value does not include specific part
	     */
	    public static final MatchValue OMITTED = new EnumValue(MatchType.OMITTED);

	    /**
	     * Returns a readable string representing its match value.
	     *
	     * @return return a readable string representing its match value.
	     */
	    public String name();
	}

enum MatchType {
    VALUE,
    ANY_OR_EMPTY,
    ANY_NOT_EMPTY,
    COLLECTION_WITH_PERMUTATION,
    OMITTED,
    REGEX,
    MATCH_EITHER_OF
}
