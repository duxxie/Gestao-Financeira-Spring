import { getUsers } from "@/services/userService";
import UserList from "@/components/UserList";

export default async function UsuariosPage() {
    const users = await getUsers();

    return (
        <main className="p-6">
            <h1 className="text-2xl font-bold mb-6">
                Usuários
            </h1>

            <UserList initialUsers={users} />
        </main>
    );
}