package ${PACKAGE_NAME};

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import ${PACKAGE_NAME}.${NAME}.${VIEWHOLDERNAME};

/**
 * Created by ${USER} on ${DATE}.
 */
public class ${NAME} extends Adapter<${VIEWHOLDERNAME}> {

	@Override
	public ${VIEWHOLDERNAME} onCreateViewHolder(ViewGroup parent, int viewType) {
		return null;
	}

	@Override
	public void onBindViewHolder(${VIEWHOLDERNAME} holder, int position) {

	}

	@Override
	public int getItemCount() {
		return 0;
	}

	public class ${VIEWHOLDERNAME} extends ViewHolder{

		public ${VIEWHOLDERNAME}(View itemView) {
			super(itemView);
		}
	}
}
