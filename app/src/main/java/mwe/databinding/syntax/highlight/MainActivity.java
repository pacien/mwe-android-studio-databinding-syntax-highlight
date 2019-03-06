package mwe.databinding.syntax.highlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mwe.databinding.syntax.highlight.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
    binding.setEnumValue(SomeEnum.FIRST_ITEM);
    setContentView(binding.getRoot());
  }
}
