package weather;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ForecastWeatherView_Factory implements Factory<ForecastWeatherView> {
  @Override
  public ForecastWeatherView get() {
    return newInstance();
  }

  public static ForecastWeatherView_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ForecastWeatherView newInstance() {
    return new ForecastWeatherView();
  }

  private static final class InstanceHolder {
    private static final ForecastWeatherView_Factory INSTANCE = new ForecastWeatherView_Factory();
  }
}
