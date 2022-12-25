package querqy.converter;

import querqy.QueryConfig;
import querqy.model.ExpandedQuery;

public interface ConverterFactory<T> {

    Converter<T> createConverter(final QueryConfig queryConfig);

//    default Converter<T> createConverter(final ExpandedQuery expandedQuery) {
//        return createConverter(expandedQuery, QueryConfig.empty());
//    }

}
