import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import com.example.widget.R

class CheckboxListAdapter(private val context: Context, private val items: List<String>) : BaseAdapter() {

    private val checkBoxStates = BooleanArray(items.size) // 체크박스 상태 배열

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_checkbox, parent, false)

        val textView = view.findViewById<TextView>(R.id.item_text)
        val checkBox = view.findViewById<CheckBox>(R.id.item_checkbox)

        textView.text = items[position]
        checkBox.isChecked = checkBoxStates[position]

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            checkBoxStates[position] = isChecked
        }

        return view
    }
}
