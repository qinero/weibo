function foLogin() {
            var oUname = document.getElementById("uname");
            var oError = document.getElementById("error_box");
            var oUpass = document.getElementById("upass");
            var oUpass1 = document.getElementById("upass1");
            var isError = true;
            oError.innerHTML = "<br>";

            if (oUname.value.length < 6 || oUname.value.length > 12) {
                oError.innerHTML = "�û���Ҫ6-12λ";
                isError = false;
                return;
            }else if(oUname.value.charCodeAt(0)>=48 &&(oUname.value.charCodeAt(0)<=57)){
                oError.innerHTML="��λ����Ϊ����";
                return;


            }else for (var i=0;i<oUname.value.length;i++){
               if((oUname.value.charCodeAt(i)<48)||(oUname.value.charCodeAt(i)>57)&&(oUname.value.charCodeAt(i)<58)&&(oUname.value.charCodeAt(i)>97)){
                oError.innerHTML="ֻ��Ϊ���ֺ���ĸ";
                return;

            }}
            if (oUpass.value.length < 6 || oUpass.value.length > 12) {
                oError.innerHTML = "����Ҫ6-12λ";
                isError = false;
                return;
            }else if(oUname.value!=oUpass1.value) {
                oError.innerHTML = "�����������֤���벻һ��";
                return;
            }
            }