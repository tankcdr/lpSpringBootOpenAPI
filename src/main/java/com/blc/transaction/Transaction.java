package  com.blc.transaction;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Transaction {
  @Getter @Setter @NonNull
  private String type;

  @Getter @Setter @NonNull
  private  String accountNumber;

  @Getter @Setter @NonNull
  private String currency;

  @Getter @Setter
  private  float amount;

  @Getter @Setter @NonNull
  private  String merchantName;

  @Getter @Setter
  private String merchantLogo;
}
