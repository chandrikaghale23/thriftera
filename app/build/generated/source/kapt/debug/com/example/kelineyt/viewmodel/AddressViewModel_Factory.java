// Generated by Dagger (https://dagger.dev).
package com.example.kelineyt.viewmodel;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddressViewModel_Factory implements Factory<AddressViewModel> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<FirebaseAuth> authProvider;

  public AddressViewModel_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<FirebaseAuth> authProvider) {
    this.firestoreProvider = firestoreProvider;
    this.authProvider = authProvider;
  }

  @Override
  public AddressViewModel get() {
    return newInstance(firestoreProvider.get(), authProvider.get());
  }

  public static AddressViewModel_Factory create(Provider<FirebaseFirestore> firestoreProvider,
      Provider<FirebaseAuth> authProvider) {
    return new AddressViewModel_Factory(firestoreProvider, authProvider);
  }

  public static AddressViewModel newInstance(FirebaseFirestore firestore, FirebaseAuth auth) {
    return new AddressViewModel(firestore, auth);
  }
}
