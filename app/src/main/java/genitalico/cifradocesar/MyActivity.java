package genitalico.cifradocesar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import genitalico.cifradocesar.encrypted.CifradoCesar2;

public class MyActivity extends Activity
{

    private Button button_accept;
    private EditText edit_encrypted;
    private EditText edit_key;
    private EditText edit_plain_text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        button_accept = (Button)findViewById(R.id.button_accept);
        button_accept.setOnClickListener(new android.view.View.OnClickListener()
        {

            public void onClick(View view)
            {
                button_acceptOnClick(view);
            }

        });

        edit_plain_text = (EditText)findViewById(R.id.edit_plain_text);
        edit_key = (EditText)findViewById(R.id.edit_key);
        edit_encrypted = (EditText)findViewById(R.id.edit_encrypted);

        edit_encrypted.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {

            public void onFocusChange(View view, boolean bol)
            {
                button_acceptOnClick(view,bol);
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void button_acceptOnClick(View view)
    {
        CifradoCesar2 cifradocesar2 = new CifradoCesar2();
        if (!edit_plain_text.getText().toString().equals("") && !edit_key.getText().toString().equals(""))
        {
            cifradocesar2.setCifrar(edit_plain_text.getText().toString(), Integer.parseInt(edit_key.getText().toString()));
            edit_encrypted.setText(cifradocesar2.getCifrar());
        }
    }

    private void button_acceptOnClick(View view,boolean bol)
    {
        CifradoCesar2 cifradocesar2 = new CifradoCesar2();
        if (!edit_plain_text.getText().toString().equals("") && !edit_key.getText().toString().equals(""))
        {
            cifradocesar2.setCifrar(edit_plain_text.getText().toString(), Integer.parseInt(edit_key.getText().toString()));
            edit_encrypted.setText(cifradocesar2.getCifrar());
        }
    }
}
