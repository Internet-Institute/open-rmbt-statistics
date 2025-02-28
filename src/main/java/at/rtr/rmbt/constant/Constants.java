package at.rtr.rmbt.constant;

import java.util.List;

public interface Constants {
    String VERSION_TEMPLATE = "%s_%s";
    Double RMBT_GEO_ACCURACY_DETAIL_LIMIT = 10000D;
    Double RMBT_GEO_DISTANCE_DETAIL_LIMIT = 3000D;
    String RMBT_DEFAULT_LANGUAGE = "en";
    List<String> RMBT_SUPPORTED_LANGUAGES = List.of("de", "en", "hr", "sv", "pl", "es", "is", "fr", "nb", "cs", "sl");
    String WEASYPRINT_PATH = "/usr/bin/weasyprint";
    String PRINCE_PATH = "/usr/bin/prince";
    String PDF_CONVERTER = "weasyprint";
    String STATISTIC_CACHE_NAME = "statisticCache";
    String OPENTESTS_STATISTIC_CACHE_NAME = "opentestsStatisticCache";
    String OPENTESTS_INTRADAY_CACHE_NAME = "opentestHourly";
    String OPENTESTS_HISTOGRAM_CACHE_NAME = "opentestHistogram";
    String STATISTICS_STALE_CACHE_NAME = "statisticStaleCache";
    Long CACHE_STALE_HOURS = 1L;
    Long CACHE_EXPIRE_HOURS = 6L;
    Long OPENTESTS_STATISTICS_CACHE_EXPIRE_SECONDS = 300L;
    Long OPENTESTS_INTRADAY_CACHE_EXPIRE_SECONDS = 3600L;
    Long OPENTESTS_HISTOGRAM_CACHE_EXPIRE_SECONDS = 3600L;
    String PROVIDER_GPS = "gps";

    String NR_NSA = "NR NSA";
}
